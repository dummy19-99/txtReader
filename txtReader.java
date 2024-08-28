import java.io.BufferedReader;
import java.io.FileReader;

public class txtReader {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("C:/CODE/JAVA/armadillo_kolokolo.txt"));
        String content;
        int num = 1;

        while (true) {
            content = br.readLine();
            if(content == null) {
                break;
            }
            sb.append(content).append("\n");
            System.out.println(num + ". " + content);
            num++;
        }

        br.close();
        sb.reverse();
        System.out.println(sb);
    }
}
