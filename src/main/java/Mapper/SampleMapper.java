package Mapper;

public class SampleMapper {

/*
{
    "id": 1414870,
    "operatorAccountId": 1430676,
    "instapayMode": "auto_instapay",
    "modeOfPayments": "NEFT",
    "frequency": "DAILY",
    "lastPaymentDate": null,
    "nextPaymentDate": "2018-09-27 00:00:00",
    "retainMinAmount": null,
    "isActive": 1
}
 */

    int id;
    int operatorAccountId;
    String instapayMode;
    String  modeOfPayments;
    String frequency;
    int retainMinAmount;
    int isActive;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOperatorAccountId() {
        return operatorAccountId;
    }

    public void setOperatorAccountId(int operatorAccountId) {
        this.operatorAccountId = operatorAccountId;
    }

    public String getInstapayMode() {
        return instapayMode;
    }

    public void setInstapayMode(String instapayMode) {
        this.instapayMode = instapayMode;
    }

    public String getModeOfPayments() {
        return modeOfPayments;
    }

    public void setModeOfPayments(String modeOfPayments) {
        this.modeOfPayments = modeOfPayments;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getRetainMinAmount() {
        return retainMinAmount;
    }

    public void setRetainMinAmount(int retainMinAmount) {
        this.retainMinAmount = retainMinAmount;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }


}
