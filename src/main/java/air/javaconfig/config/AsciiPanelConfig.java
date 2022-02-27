package air.javaconfig.config;

import asciiPanel.AsciiPanel;
import asciiPanel.AsciiFont;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiPanelConfig {
    @Bean
    public AsciiPanel asciiPanel() {
        return new AsciiPanel(80, 24, CP437_9x16_AsciiFont());
    }

    @Bean
    public AsciiFont CP437_9x16_AsciiFont() {
        return AsciiFont.CP437_9x16;
    }

    @Bean
    public AsciiFont CP437_8x8_AsciiFont() {
        return AsciiFont.CP437_8x8;
    }

    @Bean
    public AsciiFont DRAKE_10x10_AsciiFont() {
        return AsciiFont.DRAKE_10x10;
    }
}
