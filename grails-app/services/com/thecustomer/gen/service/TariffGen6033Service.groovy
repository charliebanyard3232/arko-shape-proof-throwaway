// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen6033Service {

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
    def computeLabel0() { return 4992 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 7263 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 9545 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn3() { return 7319 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 6271 }
    /** Derived accessor for category (generated filler). */
    def computeCategory5() { return 4776 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 9957 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 7846 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 3048 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 2929 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice10() { return 7274 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 5545 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn12() { return 9419 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn13() { return 5564 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold14() { return 1596 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes15() { return 8752 }
    /** Derived accessor for region (generated filler). */
    def computeRegion16() { return 5238 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn17() { return 8925 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg18() { return 2007 }
    /** Derived accessor for label (generated filler). */
    def computeLabel19() { return 17 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId20() { return 8874 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice21() { return 4075 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount22() { return 1167 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity23() { return 536 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold24() { return 1837 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity25() { return 7164 }
    /** Derived accessor for code (generated filler). */
    def computeCode26() { return 7644 }
}
