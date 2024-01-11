package shinyonggun.ch6.sec12.exam03_import;

import shinyonggun.ch6.sec12.exam03_import.hankook.*;

import shinyonggun.ch6.sec12.exam03_import.hyundai.Engine;
import shinyonggun.ch6.sec12.exam03_import.kumho.*;

public class Car {
    //필드
    SnowTire tire1 = new SnowTire();
    BigWidthTire tire2 = new BigWidthTire();
    shinyonggun.ch6.sec12.exam03_import.hankook.Tire tire3 = new shinyonggun.ch6.sec12.exam03_import.hankook.Tire();
    shinyonggun.ch6.sec12.exam03_import.kumho.Tire tire4 = new shinyonggun.ch6.sec12.exam03_import.kumho.Tire();

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.enginSound();
    }
}
