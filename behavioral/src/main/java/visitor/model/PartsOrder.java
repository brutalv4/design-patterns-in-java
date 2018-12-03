package visitor.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Data;

@Data
public class PartsOrder implements AtvPart {

  private List<AtvPart> atvParts = new ArrayList<>();

  public void addPart(AtvPart atvPart) {
    atvParts.add(atvPart);
  }

  public List<AtvPart> getAtvParts() {
    return Collections.unmodifiableList(atvParts);
  }


  @Override
  public void accept(AtvPartVisitor visitor) {
    for (AtvPart atvPart : atvParts) {
      atvPart.accept(visitor);
    }
    visitor.visit(this);
  }
}
