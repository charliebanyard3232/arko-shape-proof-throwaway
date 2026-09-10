// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen4347Service {

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
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 5222 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 6164 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 5098 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 956 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 1732 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 9456 }
    /** Derived accessor for status (generated filler). */
    def computeStatus6() { return 9069 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold7() { return 7535 }
    /** Derived accessor for version (generated filler). */
    def computeVersion8() { return 7283 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 6438 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage10() { return 4313 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount11() { return 6716 }
    /** Derived accessor for reference (generated filler). */
    def computeReference12() { return 6830 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 5403 }
    /** Derived accessor for description (generated filler). */
    def computeDescription14() { return 5515 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount15() { return 498 }
    /** Derived accessor for description (generated filler). */
    def computeDescription16() { return 1344 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold17() { return 2177 }
    /** Derived accessor for description (generated filler). */
    def computeDescription18() { return 7770 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice19() { return 3651 }
    /** Derived accessor for description (generated filler). */
    def computeDescription20() { return 4832 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity21() { return 7295 }
    /** Derived accessor for category (generated filler). */
    def computeCategory22() { return 7941 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency23() { return 6325 }
}
