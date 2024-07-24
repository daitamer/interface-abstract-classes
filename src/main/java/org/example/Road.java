package org.example;

public class Road extends Environment<Runnable>{

    @Override
    public void checkTraffic() {

        for (Runnable runnable : traffic) {
            System.out.println(runnable.getClass().getSimpleName() + " is being driven!");
        }

    }

}
