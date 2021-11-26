package com.company.Adapter;

public class VIPAdapter implements SimpleUser{
    VIPUser vipUser;

    public VIPAdapter(VIPUser vipUser){
        this.vipUser = vipUser;
    }

    @Override
    public void Purchase() {
        vipUser.discount50();
        vipUser.ContestChance();
    }
}
