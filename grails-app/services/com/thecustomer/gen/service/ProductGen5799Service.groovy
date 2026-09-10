// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen5799Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for code (generated filler). */
    def computeCode0() { return 8264 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 5536 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 8720 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 1135 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 1257 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 7486 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 8896 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 2109 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 3067 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 2905 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 9573 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 165 }
    /** Derived accessor for description (generated filler). */
    def computeDescription12() { return 1615 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 326 }
    /** Derived accessor for unitPrice (generated filler). */
}
