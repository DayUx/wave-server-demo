package fr.wave.remotedemo.enums;

public enum Event {
    SUPER_BIATHLON("Super Biathlon"),
    BIATHLON("Biathlon"),
    PRECISION("Précision"),
    RELAIS("Relais");

    private final String name;

    Event(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Event fromName(String name) {
        for (Event event : Event.values()) {
            if (event.name.equals(name)) {
                return event;
            }
        }
        return null;
    }
}
