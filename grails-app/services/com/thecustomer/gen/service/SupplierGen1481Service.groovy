// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen1481Service {

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
    def computeWeightKg0() { return 394 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 9117 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg2() { return 3979 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 1645 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 2517 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 5901 }
    /** Derived accessor for status (generated filler). */
    def computeStatus6() { return 9896 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage7() { return 2364 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 8166 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 8971 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 2500 }
    /** Derived accessor for status (generated filler). */
    def computeStatus11() { return 7528 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg12() { return 6152 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount13() { return 6083 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes14() { return 6548 }
    /** Derived accessor for category (generated filler). */
    def computeCategory15() { return 1999 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount16() { return 1641 }
    /** Derived accessor for region (generated filler). */
    def computeRegion17() { return 8524 }
    /** Derived accessor for description (generated filler). */
    def computeDescription18() { return 3257 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence19() { return 779 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn20() { return 6818 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg21() { return 7481 }
    /** Derived accessor for active (generated filler). */
    def computeActive22() { return 4257 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency23() { return 970 }
}
