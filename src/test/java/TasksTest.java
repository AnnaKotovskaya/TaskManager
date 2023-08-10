import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.TaskManager.Epic;
import ru.netology.TaskManager.Meeting;
import ru.netology.TaskManager.SimpleTask;

public class TasksTest {
    @Test
    public void test1SimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2SimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Сообщить");
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test1Epic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Яйца");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2Epic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Сыр");
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test1Meeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Приложение");
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2Meeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Тинькофф");
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

}
