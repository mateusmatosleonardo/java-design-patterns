package abstract_factory.decoders;

import abstract_factory.MsgRegisterClient;

public interface RegisterClientDecoder {
  MsgRegisterClient decode(String mensagem);
}
