// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen4774Service {

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
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 4099 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 9263 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 6170 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 3801 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 54 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 2584 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 6502 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 6869 }
    /** Derived accessor for priority (generated filler). */
    def computePriority8() { return 6550 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 3896 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 8763 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 4792 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 3627 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes13() { return 2629 }
    /** Derived accessor for priority (generated filler). */
    def computePriority14() { return 8426 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId15() { return 4286 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount16() { return 300 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId17() { return 3289 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg18() { return 9026 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence19() { return 9776 }
    /** Derived accessor for priority (generated filler). */
    def computePriority20() { return 3334 }
    /** Derived accessor for code (generated filler). */
}
