package core.observer;

import core.observable.Observable;

public abstract class Observer {

    protected Observable observable;

    public Observer() {
        this.observable = null;
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    public abstract void notify(int value);

}
