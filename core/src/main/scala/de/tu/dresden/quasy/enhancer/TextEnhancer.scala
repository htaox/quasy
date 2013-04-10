package de.tu.dresden.quasy.enhancer

import de.tu.dresden.quasy.model.AnnotatedText

/**
 * @author dirk
 * Date: 3/28/13
 * Time: 12:46 PM
 */
trait TextEnhancer {
    def enhance(text: AnnotatedText)
}
