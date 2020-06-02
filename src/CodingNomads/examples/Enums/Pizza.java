package CodingNomads.examples.Enums;

enum PizzaStatus {
    //ADD THE STATUSES
    ORDERED,
    MAKING,
    READY,
    DELIVERED;
}

class Pizza{



    public static boolean isDeliverable(PizzaStatus status) {
        // COMPLETE SO THAT THIS RETURNS TRUE WHEN STATUS IS READY
        if(status.equals(PizzaStatus.READY)){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        PizzaStatus status = PizzaStatus.READY;
        System.out.println(isDeliverable(status));

        status = PizzaStatus.ORDERED;
        System.out.println(isDeliverable(status));
    }

}
