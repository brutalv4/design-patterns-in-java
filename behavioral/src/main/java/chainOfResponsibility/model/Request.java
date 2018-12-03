package chainOfResponsibility.model;

public class Request {

  private final RequestType requestType;
  private final double amount;

  public Request(RequestType requestType, double amount) {
    this.requestType = requestType;
    this.amount = amount;
  }

  RequestType getRequestType() {
    return requestType;
  }

  double getAmount() {
    return amount;
  }
}
