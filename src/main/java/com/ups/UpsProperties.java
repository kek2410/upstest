package com.ups;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class UpsProperties {
  private String userId;
  private String accessLicenseNumber;
  private String password;

  private String apiUrl;
  private String shipConfirmUrl;
  private String shipAcceptUrl;
  private String voidUrl;
  private String labelRecoveryUrl;
  private String trackUrl;
  private String timeInTransitUrl;
}
