// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class OrderGen0951Service {

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
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 3124 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 2457 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 1781 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn3() { return 7455 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 4148 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder5() { return 5592 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 5465 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 3846 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 9052 }
    /** Derived accessor for version (generated filler). */
    def computeVersion9() { return 4646 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 6413 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity11() { return 9018 }
    /** Derived accessor for region (generated filler). */
    def computeRegion12() { return 5453 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 824 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 6335 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency15() { return 6228 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence16() { return 8182 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder17() { return 3844 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence18() { return 2446 }
    /** Derived accessor for label (generated filler). */
    def computeLabel19() { return 6378 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn20() { return 4287 }
    /** Derived accessor for active (generated filler). */
    def computeActive21() { return 8458 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName22() { return 723 }
    /** Derived accessor for category (generated filler). */
    def computeCategory23() { return 3990 }
}
