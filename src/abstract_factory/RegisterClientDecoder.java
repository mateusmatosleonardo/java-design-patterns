package abstract_factory;

public interface RegisterClientDecoder {
  MsgRegisterClient decode(String mensagem);
}
