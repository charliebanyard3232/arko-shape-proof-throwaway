// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen4221Service {

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
    /** Derived accessor for status (generated filler). */
    def computeStatus0() { return 1799 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency1() { return 4187 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 4195 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 9337 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName4() { return 9459 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 2309 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 8252 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 9123 }
    /** Derived accessor for code (generated filler). */
    def computeCode8() { return 6997 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 2154 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 6430 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence11() { return 4658 }
    /** Derived accessor for active (generated filler). */
    def computeActive12() { return 6739 }
    /** Derived accessor for status (generated filler). */
    def computeStatus13() { return 6942 }
    /** Derived accessor for version (generated filler). */
    def computeVersion14() { return 4330 }
    /** Derived accessor for status (generated filler). */
    def computeStatus15() { return 3203 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount16() { return 3928 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice17() { return 6326 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency18() { return 5800 }
}
