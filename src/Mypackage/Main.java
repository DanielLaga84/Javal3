
        //import java.util.Scanner;
        class Mypackage {

            public static void main(String[] args) {

                while (true) {
                    int dice1=(int)(Math.random()*6+1);
                    int dice2=(int)(Math.random()*6+1);
                    int sum = dice1 + dice2;

                    System.out.println("Roll: total = " + sum + ". first roll: " +dice1 + " second roll: "+ dice2);

                    if (sum==2 || sum==3 || sum==12) {
                        System.out.println("Sorry with a " + sum + " You LOSE :(");
                        break;
                    } else if(sum==7 || sum==11) {
                        System.out.println("Woah!!! With a " + sum + " You WIN!!!!!!!");
                        break;
                    }
                    }

// now making 8sides
                while (true) {
                int sides8dice1 = (int) (Math.random() * 8 + 1);
                int sides8dice2 = (int) (Math.random() * 8 + 1);
                int summary = sides8dice1 + sides8dice2;
//made 8 sides dices
                System.out.println("Today's roll is " + summary + "!");
                // Parameters if over 9 you have Won if below or equal 8 you loose.
                if (summary > 9) {
                    System.out.println("Wow you have beaten me with " + summary + "!");
                    break;
                } else if (summary <= 8); {
                System.out.println("I'm better than you with " + summary + ". Try Again !");
                break;
            }
            }
                int x = 10;
            double absoluteValue;
                {
                    if (x > 0) {
                        return;
                    } else {
                        return;
                    }
                }

            }
        }
