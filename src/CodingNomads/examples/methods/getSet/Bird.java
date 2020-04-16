package CodingNomads.examples.methods.getSet;

public class Bird {
    private String color;
    public Bird(String color){
        this.color = color;
    }
    public String getColor(){
        return color.
    }
}
/*
typically, instance variables are private, but we have public getter and setter methods on them
11:47
this way, we can apply logic if necessary before any changes or made or data is returned
11:48
for instance, before changing the “balance” variable inside my “bankAccount” object, I’d certainly hope that all the anti-fraud checks have been run, and the permissions on the request are valid etc etc
11:48
you can only do this if you have getters and setters
11:48
and the instance var is private

if the instance var is public, than the user/consumer of this class can simply alter the value of that variable any time any how

11:49
which is a big no no

(that example above is quite exagerated - but it’s more to illustrate the idea)
11:50
it’s also good practice to just set up your variables private and use getters and setters (methods in general) to affect those values - even if you’re not doing any fancy data validation or whatever on them
11:50
this helps because everyone and everything accessing this code will be required to use the methods from the very starts
11:50
(rather than the public variables)

Sara Bornstein  11:51 AM
ok

Ryan Desmond  11:51 AM
what this means is that if 2 years from now some logic needs to be add to a given “setter()” method, it can just be added
11:51
all the code already calls that method
11:52
(if the setter was not there, and added two years later, it would break all the code that interacted with the public variable directly - all those direct variable interactions would need to be updated to call the setter method)
11:52
does this make sense?

Sara Bornstein  11:53 AM
Yes I think so. So for example, if later you needed to add a check on the data like an if/then, it would go in the setter

Ryan Desmond  11:53 AM
yes
11:54
the only way you could do that is within a method
11:54
so you’d be forced to create the setter() method
11:54
to enable this logic
11:54
you’d also need to set that variable to private to force people to use the setter

Sara Bornstein  11:54 AM
ok

Ryan Desmond  11:54 AM
therefore, any code already written that uses that public variable directly would break

Sara Bornstein  11:54 AM
right

Ryan Desmond  11:54 AM
that broken code would need to be updated to work again
11:55
so, best practice is to just start with private variables and public getters/setters from the get-go

Sara Bornstein  11:55 AM
got it
 */
