package com;

import static java.util.Map.entry;

import com.ups.KeyGen;
import com.ups.UpsProperties;
import com.ups.shipping.shipconfirmrequest.BillShipperType;
import com.ups.shipping.shipconfirmrequest.CodeType;
import com.ups.shipping.shipconfirmrequest.InternationalFormsType;
import com.ups.shipping.shipconfirmrequest.ItemizedPaymentInformationType;
import com.ups.shipping.shipconfirmrequest.LabelImageFormatCodeDescriptionType;
import com.ups.shipping.shipconfirmrequest.LabelPrintMethodCodeDescriptionType;
import com.ups.shipping.shipconfirmrequest.LabelSpecificationType;
import com.ups.shipping.shipconfirmrequest.LabelStockSizeType;
import com.ups.shipping.shipconfirmrequest.PackageType;
import com.ups.shipping.shipconfirmrequest.PackageWeightType;
import com.ups.shipping.shipconfirmrequest.PackagingTypeType;
import com.ups.shipping.shipconfirmrequest.ProductType;
import com.ups.shipping.shipconfirmrequest.RequestType;
import com.ups.shipping.shipconfirmrequest.ServiceType;
import com.ups.shipping.shipconfirmrequest.ShipFromAddressType;
import com.ups.shipping.shipconfirmrequest.ShipFromType;
import com.ups.shipping.shipconfirmrequest.ShipToAddressType;
import com.ups.shipping.shipconfirmrequest.ShipToType;
import com.ups.shipping.shipconfirmrequest.ShipmentChargeType;
import com.ups.shipping.shipconfirmrequest.ShipmentConfirmRequest;
import com.ups.shipping.shipconfirmrequest.ShipmentServiceOptionsType;
import com.ups.shipping.shipconfirmrequest.ShipmentType;
import com.ups.shipping.shipconfirmrequest.ShipperAddressType;
import com.ups.shipping.shipconfirmrequest.ShipperType;
import com.ups.shipping.shipconfirmrequest.SoldToAddressType;
import com.ups.shipping.shipconfirmrequest.SoldToType;
import com.ups.shipping.shipconfirmrequest.TransactionReferenceType;
import com.ups.shipping.shipconfirmrequest.UnitOfMeasurementType;
import com.ups.shipping.shipconfirmrequest.UnitType;
import com.ups.shipping.shipconfirmresponse.ShipmentConfirmResponse;
import com.ups.tracking.accessrequest.AccessRequest;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

// @SpringBootApplication
public class TestApplication {

  //  public static void main(String[] args) {
  //    SpringApplication.run(TestApplication.class, args);
  //  }

  //    properties.setAccessLicenseNumber("AD766237951A0A75");
  //    properties.setUserId("70479V");
  //    properties.setPassword("ups-1234");
  public static UpsProperties getProperty() {
    return UpsProperties.builder()
        //        .accessLicenseNumber("1A83A0")
//    access-license-number: AD766237951A0A75
//    user-id: 70479V
//    password: ups-1234
        .accessLicenseNumber("CD9E50C7E7436C55")
        .userId("deleokorea")
        .password("Deleo1234~!")
        .apiUrl("https://onlinetools.ups.com/ups.app/xml")
//        .apiUrl("https://wwwcie.ups.com/ups.app/xml")
        .shipConfirmUrl("/ShipConfirm")
        .shipAcceptUrl("/ShipAccept")
        .build();
  }

  public static Map<Class<?>, JAXBContext> getContextMap() throws JAXBException {
    return Map.ofEntries(
        entry(ShipmentConfirmRequest.class, JAXBContext.newInstance(ShipmentConfirmRequest.class)),
        entry(
            ShipmentConfirmResponse.class, JAXBContext.newInstance(ShipmentConfirmResponse.class)),
        entry(
            com.ups.shipping.shipacceptrequest.ShipmentAcceptRequest.class,
            JAXBContext.newInstance(
                com.ups.shipping.shipacceptrequest.ShipmentAcceptRequest.class)),
        entry(
            com.ups.shipping.shipacceptresponse.ShipmentAcceptResponse.class,
            JAXBContext.newInstance(
                com.ups.shipping.shipacceptresponse.ShipmentAcceptResponse.class)),
        entry(
            com.ups.shipping.voidshipmentrequest.VoidShipmentRequest.class,
            JAXBContext.newInstance(
                com.ups.shipping.voidshipmentrequest.VoidShipmentRequest.class)),
        entry(
            com.ups.shipping.voidshipmentresponse.VoidShipmentResponse.class,
            JAXBContext.newInstance(
                com.ups.shipping.voidshipmentresponse.VoidShipmentResponse.class)),
        entry(
            com.ups.shipping.labelrecoveryrequest.LabelRecoveryRequest.class,
            JAXBContext.newInstance(
                com.ups.shipping.labelrecoveryrequest.LabelRecoveryRequest.class)),
        entry(
            com.ups.shipping.labelrecoveryresponse.LabelRecoveryResponse.class,
            JAXBContext.newInstance(
                com.ups.shipping.labelrecoveryresponse.LabelRecoveryResponse.class)),
        entry(
            com.ups.tracking.trackrequest.TrackRequest.class,
            JAXBContext.newInstance(com.ups.tracking.trackrequest.TrackRequest.class)),
        entry(
            com.ups.tracking.trackresponse.TrackResponse.class,
            JAXBContext.newInstance(com.ups.tracking.trackresponse.TrackResponse.class)),
        entry(
            com.ups.timeintransit.timeintransitrequest.TimeInTransitRequest.class,
            JAXBContext.newInstance(
                com.ups.timeintransit.timeintransitrequest.TimeInTransitRequest.class)),
        entry(
            com.ups.timeintransit.timeintransitresponse.TimeInTransitResponse.class,
            JAXBContext.newInstance(
                com.ups.timeintransit.timeintransitresponse.TimeInTransitResponse.class)));
  }

  public static String AccessRequestBody(UpsProperties properties) throws JAXBException {
    var marshaller = JAXBContext.newInstance(AccessRequest.class).createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    var sw = new StringWriter();
    marshaller.marshal(
        AccessRequest.builder()
            .accessLicenseNumber(properties.getAccessLicenseNumber())
            .userId(properties.getUserId())
            .password(properties.getPassword())
            .build(),
        sw);
    return sw.toString();
  }

  public static RequestType getRequestType() {
    String txId = KeyGen.getRandomTimeKey();
    return RequestType.builder()
        .requestAction("ShipConfirm") // XML 서비스에서 수행 할 작업을 나타냅니다.
        .requestOption("validate") // nonvalidate/validate - 주소에 대한 유효성검사 처리 여부 (배송 API 사용으로 주소 수정이
        // 발생시 수수료 발생함)
        .subVersion("1807") // Required : No - Version 을 명시 (1601, 1607, 1701, 1707, 1801, 1807)
        .transactionReference(
            TransactionReferenceType.builder()
                .customerContext(txId) // Required : No - Transaction reference id (Length 1..512)
                .build())
        .build();
  }

  public static ShipperType getShipperType(UpsProperties properties) {
    return ShipperType.builder()
        .name("UPS KOREA") // 배송업체의 이름 (35자 허용, 30자만 라벨 인쇄)
        .attentionName("test Shipper Attention") // 배송인 이름 (35자 허용, 30자만 라벨 인쇄) - shipFrom
        // 주소가 없는 경우 필수
        // .companyDisplayableName("Shipper Company Displayable Name")
        .shipperNumber(properties.getUserId()) // Shipper's six digit account number
        .phoneNumber("0220221056")
        // .taxIdentificationNumber("1234567877")
        .address(
            ShipperAddressType.builder()
                .addressLine1("shipper Address Line 1") // Required - Length 35
                .addressLine2("shipper Address Line 2")
                .addressLine3("shipper Address Line 3")
                .city("Seoul")
                // .stateProvinceCode("StateProvinceCode")  // 배송국가가 US or CA 인
                // 경우 필수 이며 주 코드를 입력
                .postalCode("07295")
                .countryCode("KR")
                .build())
        .build();
    // end of shipper
  }

  public static ShipToType getShipToType() {
    return ShipToType.builder()
        .companyName("Ship To Company Name") // 수취인 회사명
        .attentionName("Ship To Attention Name") // 수취인 명
        .phoneNumber("97225377171")
        .address(
            ShipToAddressType.builder()
                .addressLine1("shipper Address Line 1")
                .addressLine2("shipper Address Line 2")
                .addressLine3("shipper Address Line 3")
                .city("New York")
                .stateProvinceCode("NY")
                .postalCode("10001")
                .countryCode("US")
                .build())
        .build();
  }

  public static ShipFromType getShipFromType() {
    return ShipFromType.builder()
        .companyName("Ship From Company Name")
        .attentionName("Ship From Attention Name")
        .phoneNumber("1234567890")
        .address(
            ShipFromAddressType.builder()
                .addressLine1("shipper Address Line 1")
                .addressLine2("shipper Address Line 2")
                .addressLine3("shipper Address Line 3")
                .city("Seoul")
                .postalCode("07295")
                .countryCode("KR")
                .build())
        .build();
  }

  public static SoldToType getSoldToType() {
    return SoldToType.builder()
        .companyName("Sold To Importer Test Company")
        .attentionName("Sold To Importer Test Attention")
        .phoneNumber("1112223333")
        .address(
            SoldToAddressType.builder()
                .addressLine1("shipper Address Line 1")
                .addressLine2("shipper Address Line 2")
                .addressLine3("shipper Address Line 3")
                .city("lafayetee")
                .stateProvinceCode("CO")
                .postalCode("80026")
                .countryCode("US")
                .build())
        .build();
  }

  public static ItemizedPaymentInformationType getItemizedPaymentInformationType(
      UpsProperties properties) {
    return ItemizedPaymentInformationType.builder()
        .shipmentCharge(
            List.of(
                ShipmentChargeType.builder()
                    .type("01")
                    .billShipper(
                        BillShipperType.builder()
                            .accountNumber(properties.getUserId())
//                            .accountNumber("1A83A0")
                            .build())
                    .build()))
        .build();
  }

  public static List<PackageType> getPackages() {
    List<PackageType> packageTypes = new java.util.ArrayList<>();
    packageTypes.add(
        PackageType.builder()
            .packagingType(
                PackagingTypeType.builder().code("02").description("Customer Supplied").build())
            .packageWeight(
                PackageWeightType.builder()
                    .unitOfMeasurement(UnitOfMeasurementType.builder().code("KGS").build())
                    .weight("1")
                    .build())
            .build());
    packageTypes.add(
        PackageType.builder()
            .packagingType(
                PackagingTypeType.builder().code("02").description("Customer Supplied").build())
            .packageWeight(
                PackageWeightType.builder()
                    .unitOfMeasurement(UnitOfMeasurementType.builder().code("KGS").build())
                    .weight("2")
                    .build())
            .build());
    return packageTypes;
  }

  public static ShipmentServiceOptionsType getShipmentServiceOptionsType() {
    return ShipmentServiceOptionsType.builder()
        .internationalForms(
            InternationalFormsType.builder()
                .formType(List.of("01"))
                // .invoiceNumber("invoiceNumber")
                // .purchaseOrderNumber("purchaseOrderNumber")
                .reasonForExport("Sample")
                .currencyCode("USD")
                .invoiceDate("20180604")
                .product(
                    List.of(
                        ProductType.builder()
                            .description(List.of("test1 item"))
                            .unit(
                                UnitType.builder()
                                    .number("1")
                                    .value("1")
                                    .unitOfMeasurement(CodeType.builder().code("EA").build())
                                    .build())
                            .commodityCode("1234567890")
                            .originCountryCode("KR")
                            .build(),
                        ProductType.builder()
                            .description(List.of("test2 item"))
                            .unit(
                                UnitType.builder()
                                    .number("2")
                                    .value("2")
                                    .unitOfMeasurement(CodeType.builder().code("EA").build())
                                    .build())
                            .commodityCode("0987654321")
                            .originCountryCode("KR")
                            .build()))
                .build())
        .build();
  }

  public static ShipmentConfirmRequest getRequest(UpsProperties properties) {
    return ShipmentConfirmRequest.builder()
        .request(getRequestType())
        .shipment(
            ShipmentType.builder()
                .description("test goods") // 운송장 아래에 표시되는 품명
                .shipper(getShipperType(properties))
                .shipTo(getShipToType())
                .shipFrom(getShipFromType())
                .soldTo(getSoldToType())
                .itemizedPaymentInformation(getItemizedPaymentInformationType(properties))
                .service(ServiceType.builder().code("65").build())
                ._package(getPackages())
                .shipmentServiceOptions(getShipmentServiceOptionsType())
                .build())
        .labelSpecification(
            LabelSpecificationType.builder()
                .labelPrintMethod(LabelPrintMethodCodeDescriptionType.builder().code("GIF").build())
                .labelImageFormat(LabelImageFormatCodeDescriptionType.builder().code("GIF").build())
                .labelStockSize(LabelStockSizeType.builder().height("4").width("6").build())
                .build())
        .build();
  }

  public static void main(String[] args) throws Exception {
    var properties = getProperty();
    var jaxbContextMap = getContextMap();
    var accessRequestBody = AccessRequestBody(properties);
    //  https://wwwcie.ups.com/ups.app/xml # Test URL
    var request = getRequest(properties);
    System.out.println(request);
    var url = properties.getApiUrl() + properties.getShipConfirmUrl();
    System.out.println("### UPS Request URL :\n{}" + url);
    var reqMashall = jaxbContextMap.get(request.getClass()).createMarshaller();
    reqMashall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    var stringWriter = new StringWriter();
    reqMashall.marshal(request, stringWriter);
    var xmlRequestBody = accessRequestBody + stringWriter;
    HttpHeaders headers;
    headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
    var restTemplate = new RestTemplate();
    var exchange =
        restTemplate.exchange(
            url, HttpMethod.POST, new HttpEntity<>(xmlRequestBody, headers), String.class);
    System.out.println("### UPS Response Status Code :\n{}" + exchange.getStatusCode());
    String xmlResponseBody = exchange.getBody();
    System.out.println("### UPS Response Body DTO :\n{}" + xmlResponseBody);
    var unmarshaller = jaxbContextMap.get(ShipmentConfirmResponse.class).createUnmarshaller();
    var responseDto =
        (ShipmentConfirmResponse) unmarshaller.unmarshal(new StringReader(xmlResponseBody));
    System.out.println("Unmarshalled UPS Response Body DTO :\n{}" + responseDto);
  }
}
