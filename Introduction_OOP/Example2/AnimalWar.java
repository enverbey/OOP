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


public class AnimalWar {
    public static void main(String[] arg) {
        Lion lion1 = new Lion("Simba");
        
        Gazelle gazelle1 = new Gazelle("Gazelle1");
        Gazelle gazelle2 = new Gazelle("Gazelle2");

        lion1.display();
        gazelle1.display();
        gazelle2.display();

        lion1.eatGazelle(gazelle1);
        lion1.eatGazelle(gazelle2);

        lion1.display();
        gazelle1.display();
        gazelle2.display();
    }

    /*
    Why don't you try to develop the code?
    -> Work on Gazelle class
    -> Also you can add more animals
    -> Add Habitat class to manage the animals
    */

   /*
   Lion's attributes:
    - name: String
    - level: int
    - gazelleEaten: int
    - live: boolean

    Lion's methods:
    - Constructor: Lion(String name)
    - levelUp(): void
    - tryEat(Gazelle gazelle, short chance): void
    - eatGazelle(Gazelle gazelle): void
    - display(): void

   */

    /*
    Gazelle's attributes:
    - name: String
    - live: boolean

    Gazelle's methods:
    - Constructor: Gazelle(String name)
    - display(): void
    - isLive(): boolean
    - makeDead(): void
    */


    /*
    Explanation of public methods:
    - levelUp(): Upgrade to the next level.
    - eatGazelle(Gazelle gazelle): Try to eat a gazelle. The chance of catching a gazelle depends on the level of the lion.
    - display(): Display the name of the lion and its status.
    - isLive(): Return the status of the gazelle.
    - makeDead(): Make the gazelle dead.
    */

}