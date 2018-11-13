package bridge.printer.formatter;

import bridge.printer.model.Detail;
import java.util.List;

public interface Formatter {

  String format(String header, List<Detail> details);
}
