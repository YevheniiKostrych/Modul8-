package modul6;

class Database {
    private static final Database database = new Database();

    private Database() {
        //Ініціалізуємо з'єднання з базою даних
    }

    public static Database getInstance() {
        return database;
    }

    public Object getData() {

getInstance().getData().toString().trim().toCharArray();
        return getInstance().hashCode();
    }
}

    class DatabaseTest {
        public static void main(String[] args) {
            Database.getInstance().getData();
            Database.getInstance().getData();
        }

}