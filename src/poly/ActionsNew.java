package poly;

public enum ActionsNew {

    RUN("run") {
        @Override
        public void exec(String param) {
            System.out.println("RUN - Param: " + param);
        }
    }, WALK("walk") {
        @Override
        public void exec(String param) {
            System.out.println("WALK - Param: " + param);
        }
    }, EAT("eat") {
        @Override
        public void exec(String param) {
            System.out.println("EAT - Param: " + param);
        }
    }, CRY("cry") {
        @Override
        public void exec(String param) {
            System.out.println("CRY - Param: " + param);
        }
    }, JUMP("jump") {
        @Override
        public void exec(String param) {
            System.out.println("JUMP - Param: " + param);
        }
    };

    private String name;

    ActionsNew(String name) {
        this.name = name;
    }

    public abstract void exec(String param);
}
