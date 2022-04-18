import java.net.*;
/**
 * Вспомогательный класс.
 * Служит для хранения пары: URL + его глубина относительно сайта введёного пользователем.
 * Хранения адреса сайта в классе URL обеспечивает дополнительную валидацию значения.
 */
public class URLDepthPair {

    private URL URL;
    private int depth;

    /**
     * Конструктор класса.
     * Принимает на вход пару для хранения.
     */
    public URLDepthPair(URL url, int d) throws MalformedURLException {
        URL = new URL(url.toString());
        depth = d;
    }

    /**
     * Возвращает строку состоящую из адреса сайта и его глубины.
     */
    @Override
    public String toString()
    {
        return "URL: " + URL.toString() + ", Depth: " + depth;
    }

    /**
     * Возвращает объект класса типа URL(полный путь до сайта)
     */
    public URL getURL() {

        return URL;
    }

    /**
     * Возвращает глубину сайта, относительно сайта введённого пользователем.
     */
    public int getDepth() {

        return depth;
    }

    /**
     * Возвращает имя хоста на сервере
     */
    public String getHost() {
        return URL.getHost();
    }

    /**
     * Возвращает имя ресурса у хоста
     */
    public String getDocPath() {

        return URL.getPath();
    }
}