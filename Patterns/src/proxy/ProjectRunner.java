package proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.github.com/EgorovOleg26/myAlgorithms");
        project.run();
    }
}
