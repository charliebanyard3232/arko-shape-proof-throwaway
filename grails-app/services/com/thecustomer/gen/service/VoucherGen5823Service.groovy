// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen5823Service {

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
    /** Derived accessor for percentage (generated filler). */
    def computePercentage0() { return 3549 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 6508 }
    /** Derived accessor for version (generated filler). */
    def computeVersion2() { return 9534 }
    /** Derived accessor for label (generated filler). */
    def computeLabel3() { return 7499 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 9821 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 7376 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 3823 }
    /** Derived accessor for category (generated filler). */
    def computeCategory7() { return 8565 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity8() { return 8146 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 9939 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes10() { return 2515 }
    /** Derived accessor for priority (generated filler). */
    def computePriority11() { return 8053 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 9604 }
    /** Derived accessor for description (generated filler). */
}
