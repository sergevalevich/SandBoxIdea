package com.valevich.sandbox.strategy;

import com.sun.org.apache.xpath.internal.operations.String;

public class StrategySample {


    public static void main(String[] args) {

        Character knight = new Knight(new AxeBehavior());

        Character troll = new Troll(new KnifeBehavior());


        knight.useWeapon();
        troll.useWeapon();

        knight.fight();
        troll.fight();

        knight.setWeapon(new BowBehavior());
        knight.useWeapon();
        knight.fight();
    }


    abstract static class Char {

        abstract void useWeapon();

    }

    static class Wizard extends Char {

        @Override
        void useWeapon() {
            System.out.println("using magic");
        }

    }

    static class Tank extends Char {

        @Override
        void useWeapon() {
            System.out.println("using bullets");
        }

    }

    static class SuperTank extends Char {

        @Override
        void useWeapon() {
            System.out.println("using bullets");
            //duplicates TANK
            //cannot reuse "bullets using" behavior
            //cannot change behavior in runtime
        }

    }


    //characters

    static abstract class Character {

        WeaponBehavior weaponBehavior;

        Character(WeaponBehavior weaponBehavior) {
            this.weaponBehavior = weaponBehavior;
        }

        public void setWeapon(WeaponBehavior weaponBehavior) {
            this.weaponBehavior = weaponBehavior;
        }

        void useWeapon() {
            weaponBehavior.useWeapon();
        }

        abstract void fight();
    }

    static class Knight extends Character {

        Knight(WeaponBehavior weaponBehavior) {
            super(weaponBehavior);
        }

        @Override
        void fight() {
            System.out.println("fighting like a Knigh");
        }
    }

    static class Troll extends Character {

        Troll(WeaponBehavior weaponBehavior) {
            super(weaponBehavior);
        }

        @Override
        void fight() {
            System.out.println("fighting like a troll");
        }
    }

    //behavior
    interface WeaponBehavior {

        void useWeapon();
    }

    static class KnifeBehavior implements WeaponBehavior {

        @Override
        public void useWeapon() {
            System.out.println("using knife");
        }
    }

    static class AxeBehavior implements WeaponBehavior {

        @Override
        public void useWeapon() {
            System.out.println("using axe");
        }
    }

    static class BowBehavior implements WeaponBehavior {

        @Override
        public void useWeapon() {
            System.out.println("using arrows and bows");
        }
    }

}
