/* ************************************************************************** */
/*                                                                            */
/*                                                                            */
/*   AnimalWar.java                                                           */
/*                                                                            */
/*   By: enverbey                                                             */
/*                                                                            */
/*   Created: 2024/10/20 13:21:49 by enverbey                                 */
/*   Updated: 2024/10/20 13:21:50 by enverbey                                 */
/*                                                                            */
/* ************************************************************************** */

/* **************************** [v] CONTACT [v] **************************** */
/*
    <Discord:enveryilmaz>
    <Mail   :enverbey1534@gmail.com>
*/
/* **************************** [^] CONTACT [^] **************************** */

/* **************************** [v] OTHER LINKS [v] ************************ */
/*
    <Github :github.com/enverbey>
    <Youtube:youtube.com/@enverbeyTR>
*/
/* **************************** [^] OTHER LINKS [^] ************************ */

public class Main{
    public static void main(String[] args){
        Car car1 = new Car("Red", "Toyota", 2020, 0, 200);
        car1.display();
        car1.accelerate();
        car1.display();
        car1.brake();
        car1.display();
    }
}

    /*
    Car's attributes:
     - color: String
     - model: String
     - year: int
     - speed: int
     - maxSpeed: int

    Car's methods:
    - accelerate(): void
    - brake(): void
    - display(): void
    */

    /*
    Explanation of public methods:
    - accelerate(): Increases the speed of the car by 10.
    - brake(): Decreases the speed of the car by 10.
    - display(): Prints the color, model, year, speed, and maxSpeed of the car.
    */