package com.company.Factory;

public class FactoryGames implements Factory {

    @Override
    public Games createSurvival() {
        return new Survival();
    }

    @Override
    public Games createAdventure() {
        return new Adventure();
    }

    @Override
    public Games createShooter() {
        return new Shooter();
    }
}
