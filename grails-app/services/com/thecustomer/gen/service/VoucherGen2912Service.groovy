// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen2912Service {

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
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 961 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes1() { return 9553 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 6692 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn3() { return 5063 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName4() { return 9020 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 844 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 858 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 2590 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount8() { return 805 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice9() { return 4234 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 7241 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 846 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName12() { return 4810 }
    /** Derived accessor for weightKg (generated filler). */
}
