package com.company;



public class Main {

    public static void main(String[] args) {
        Banana banan=new Banana("несозревший") {
            @Override
            public void maturate() {
                this.condition="созревший";
                System.out.println("Банан созрел");
            }
        };
        Monkey monkey=new Monkey(12, "черный", 70, 150, false) {
            @Override
            public void eat() {
                if ((banan.condition).equals("созревший")){
                    System.out.println("Обезьянка съела банан");
                }
                else if ((banan.condition).equals("несозревший")){
                    System.out.println("Обезьянка не смогла съесть банан");
                }
            }

            @Override
            public void climb() {
                if (!this.onTheTree){
                System.out.println("Обезьянка залезла на дерево");
                this.onTheTree=true;
                }
                else {
                    System.out.println("Обезьянка уже на дереве");
                }
            }

            @Override
            public void jump() {
                if (this.onTheTree){
                    System.out.println("Обезьянка спрыгнула с дерева");
                    this.onTheTree=false;
                }
                else {
                    System.out.println("Обезьяне не с чего спрыгивать");
                }
            }
        };
        monkey.eat();
        banan.maturate();
        monkey.eat();
        monkey.jump();
        monkey.climb();

    }

    public abstract class banana{
        String condition;
        public banana(String condition){
            this.condition=condition;
        }
    }
}
