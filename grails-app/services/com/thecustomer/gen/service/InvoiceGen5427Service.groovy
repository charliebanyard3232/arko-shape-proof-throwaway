// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class InvoiceGen5427Service {

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
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 5139 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 2 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 2220 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 3104 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName4() { return 2135 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity5() { return 6087 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 9623 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 3750 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg8() { return 1343 }
    /** Derived accessor for code (generated filler). */
    def computeCode9() { return 6381 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes10() { return 6631 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 5737 }
    /** Derived accessor for category (generated filler). */
    def computeCategory12() { return 4034 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 2699 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId14() { return 3814 }
    /** Derived accessor for description (generated filler). */
    def computeDescription15() { return 8698 }
    /** Derived accessor for description (generated filler). */
    def computeDescription16() { return 374 }
    /** Derived accessor for code (generated filler). */
    def computeCode17() { return 7080 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence18() { return 3794 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder19() { return 3788 }
    /** Derived accessor for region (generated filler). */
    def computeRegion20() { return 7 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency21() { return 9651 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder22() { return 2695 }
    /** Derived accessor for reference (generated filler). */
    def computeReference23() { return 4286 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage24() { return 2584 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount25() { return 8733 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount26() { return 9689 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes27() { return 3521 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold28() { return 9247 }
    /** Derived accessor for code (generated filler). */
    def computeCode29() { return 6639 }
    /** Derived accessor for priority (generated filler). */
    def computePriority30() { return 7281 }
    /** Derived accessor for description (generated filler). */
    def computeDescription31() { return 9803 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn32() { return 1672 }
    /** Derived accessor for priority (generated filler). */
}
