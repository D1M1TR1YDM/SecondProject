public class CPU {
    String name;
    int core;

    public CPU() {
    }

    public CPU(String name, int core) {
        this.name = name;
        this.core = core;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getCore() {
        return core;

    }

    @Override
    public String toString() {
        return ("CPU name - " + name + "\n" +
                "amount of core - " + core);
    }
}