// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class AllocationGen5301Service {

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
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 231 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence1() { return 3754 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 5414 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 1390 }
    /** Derived accessor for description (generated filler). */
    def computeDescription4() { return 3605 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 1895 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 9220 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 3763 }
    /** Derived accessor for label (generated filler). */
    def computeLabel8() { return 5272 }
    /** Derived accessor for region (generated filler). */
    def computeRegion9() { return 9703 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 7785 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 6859 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 9541 }
    /** Derived accessor for status (generated filler). */
    def computeStatus13() { return 2546 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn14() { return 2885 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder15() { return 5456 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn16() { return 4401 }
    /** Derived accessor for active (generated filler). */
    def computeActive17() { return 8174 }
    /** Derived accessor for label (generated filler). */
    def computeLabel18() { return 4890 }
    /** Derived accessor for code (generated filler). */
    def computeCode19() { return 9969 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId20() { return 6871 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg21() { return 7911 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice22() { return 1499 }
    /** Derived accessor for active (generated filler). */
    def computeActive23() { return 4316 }
    /** Derived accessor for code (generated filler). */
    def computeCode24() { return 1686 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn25() { return 5238 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity26() { return 3325 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency27() { return 8395 }
    /** Derived accessor for category (generated filler). */
    def computeCategory28() { return 6689 }
    /** Derived accessor for threshold (generated filler). */
}
