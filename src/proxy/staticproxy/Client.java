package proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(target);
        teacherDaoProxy.teach();
    }
}
