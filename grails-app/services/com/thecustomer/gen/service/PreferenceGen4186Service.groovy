// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen4186Service {

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
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 4983 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 8323 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg2() { return 4445 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 8616 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 4631 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 7510 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 2210 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder7() { return 8419 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity8() { return 3759 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder9() { return 4892 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 6522 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 2365 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 4998 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency13() { return 525 }
}
