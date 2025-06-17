package abstract_factory.factory;

import abstract_factory.decoders.RegisterAccountDecoder;
import abstract_factory.decoders.RegisterClientDecoder;

// Fábrica abstrata
public abstract class DecoderFactory {
  public abstract RegisterClientDecoder createRegisterClientDecoder();
  public abstract RegisterAccountDecoder createRegistrarAccountDecoder();

  public static DecoderFactory factoryToOrigin(String origin) {
    if ("X".equals(origin)) return new XMLDecoderFactory();
    if ("Y".equals(origin)) return new CSVDecoderFactory();
    if ("Z".equals(origin)) return new FixedTextDecoderFactory();
    throw new IllegalArgumentException("Origem desconhecida: " + origin);
  }

}
