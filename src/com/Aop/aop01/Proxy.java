package src.com.Aop.aop01;

public class Proxy implements Rent {
    private Host host;
    public Proxy(Host host){
        this.host =host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        fee();
        hetong();

    }

    public void seeHouse(){
        System.out.println("去看房");
    }

    public void fee(){
        System.out.println("交中介费");
    }

    public  void hetong(){
        System.out.println("签合同");
    }

}
