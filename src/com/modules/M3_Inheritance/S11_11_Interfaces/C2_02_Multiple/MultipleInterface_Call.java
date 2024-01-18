package com.modules.M3_Inheritance.S11_11_Interfaces.C2_02_Multiple;

public class MultipleInterface_Call {
    public static void main(String[] args) {
        MobilePhone mobilePhoneRefObj;
        mobilePhoneRefObj = new MobilePhone();

        mobilePhoneRefObj.startAudioCall();
        mobilePhoneRefObj.startVideoCall();


    }
}

// Two interfaces with methods
interface VideoCall {
    void startVideoCall();
}

interface AudioCall {
    void startAudioCall();
}

// Class implementing both interfaces
class MobilePhone implements VideoCall, AudioCall {
    @Override
    public void startVideoCall() {
        // Video call implementation
        System.out.println("Starting Video Call");
    }

    @Override
    public void startAudioCall() {
        // Audio call implementation
        System.out.println("Starting Audio Call");
    }
}

