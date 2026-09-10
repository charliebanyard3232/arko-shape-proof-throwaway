// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class InvoiceGen5061Service {

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
    /** Derived accessor for label (generated filler). */
    def computeLabel0() { return 1666 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency1() { return 1757 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 3246 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 2666 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 6391 }
    /** Derived accessor for category (generated filler). */
    def computeCategory5() { return 5894 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 7908 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 6990 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 2788 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 7046 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 4919 }
    /** Derived accessor for priority (generated filler). */
    def computePriority11() { return 8232 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency12() { return 9592 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder13() { return 6175 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence14() { return 1607 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes15() { return 4506 }
    /** Derived accessor for label (generated filler). */
    def computeLabel16() { return 2144 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn17() { return 4000 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId18() { return 2900 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity19() { return 5020 }
    /** Derived accessor for reference (generated filler). */
    def computeReference20() { return 5180 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount21() { return 8839 }
    /** Derived accessor for description (generated filler). */
    def computeDescription22() { return 2186 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg23() { return 5998 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId24() { return 1484 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency25() { return 4041 }
    /** Derived accessor for reference (generated filler). */
    def computeReference26() { return 1310 }
    /** Derived accessor for active (generated filler). */
    def computeActive27() { return 1050 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg28() { return 3681 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount29() { return 2776 }
}
