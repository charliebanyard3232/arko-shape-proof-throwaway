// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class QuotationGen5025Service {

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
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn0() { return 4780 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 752 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 9504 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 3780 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 8729 }
    /** Derived accessor for category (generated filler). */
    def computeCategory5() { return 6742 }
    /** Derived accessor for active (generated filler). */
    def computeActive6() { return 9641 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 9438 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg8() { return 245 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold9() { return 9819 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 6632 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName11() { return 7268 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 8779 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice13() { return 8583 }
    /** Derived accessor for version (generated filler). */
    def computeVersion14() { return 2173 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice15() { return 1155 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg16() { return 9691 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice17() { return 2344 }
    /** Derived accessor for description (generated filler). */
    def computeDescription18() { return 2737 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn19() { return 5382 }
    /** Derived accessor for createdOn (generated filler). */
}
