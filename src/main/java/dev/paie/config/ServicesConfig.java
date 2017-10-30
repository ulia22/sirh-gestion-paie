/**
 * 
 */
package dev.paie.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ETY9
 *
 */
@Configuration
@ComponentScan({"dev.paie.service", "dev.paie.util"})
public class ServicesConfig {

}
