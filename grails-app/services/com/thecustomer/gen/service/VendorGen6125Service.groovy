// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen6125Service {

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
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg0() { return 5124 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 3772 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 3782 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName3() { return 6340 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 1993 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 3369 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg6() { return 4229 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 294 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 9775 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 1806 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 7903 }
    /** Derived accessor for code (generated filler). */
    def computeCode11() { return 5461 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 8523 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn13() { return 9565 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 784 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes15() { return 1052 }
    /** Derived accessor for reference (generated filler). */
    def computeReference16() { return 6908 }
    /** Derived accessor for priority (generated filler). */
    def computePriority17() { return 4532 }
    /** Derived accessor for version (generated filler). */
    def computeVersion18() { return 1641 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency19() { return 193 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage20() { return 1644 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage21() { return 3396 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes22() { return 7903 }
}
