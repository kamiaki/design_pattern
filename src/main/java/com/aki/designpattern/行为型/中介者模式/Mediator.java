package com.aki.designpattern.行为型.中介者模式;

/**
 * 黑中介
 */
public class Mediator extends AbstractMediator {
    //在具体的中介手里，会有同事类的信息
    private Landlord landlord;//房东
    private Tenant tenant;//租客

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void operate(AbstractColleague colleague, String message) {
        if (colleague == landlord) {
            tenant.receive(message);
        } else if (colleague == tenant) {
            landlord.receive(message);
        }
    }
}
