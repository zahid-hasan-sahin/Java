package admissiontest.problem4.part2;

public class Food {

    /*
    if we make this method not synchronized then hare and tortoise can run eat method 
    at the same time.
    that's mean  output can be ->
    
    tortoise begins eat
    hare begins eat
    tortoise done eating
    hare done eating
    ------------------------------------
    if we make this method synchronized then hare and tortoise can't run eat method 
    at the same time. 
    that's mean output can be ->
    
    tortoise begins eat
    tortoise done eating
    hare begins eat
    hare done eating
    
    
    
     */
    synchronized public void eat(int random, String name) throws InterruptedException {
        System.out.println(name + " begins eat");
        Thread.sleep(random);
        System.out.println(name + " done eating");
    }
}
