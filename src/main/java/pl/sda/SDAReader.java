package pl.sda;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface SDAReader {
    List<Card> read(String filePath) throws IOException;
}
