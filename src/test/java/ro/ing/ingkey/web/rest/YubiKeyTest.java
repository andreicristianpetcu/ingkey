package ro.ing.ingkey.web.rest;

import com.yubico.client.v2.VerificationResponse;
import com.yubico.client.v2.YubicoClient;
import org.junit.Test;

public class YubiKeyTest {

    @Test
    public void testYubiKey() throws Exception {
        // clientId and secretKey are retrieved from https://upgrade.yubico.com/getapikey
        Integer clientId = 25516;
        String secretKey = "cccccceulftecflceftghfbcndtdlcbnhhcejjritknh";
        YubicoClient client = YubicoClient.getClient(clientId, secretKey);

        // otp is the OTP from the YubiKey
        String otp = "cccccceulftedfuugdggruttvebngdjvruvhubvfgttd";
        VerificationResponse response = client.verify(otp);
        assert response.isOk();
    }

}
