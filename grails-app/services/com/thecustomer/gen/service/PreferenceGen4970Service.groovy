// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen4970Service {

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
    def computeCurrency0() { return 703 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 7586 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 5245 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 3307 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 2655 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity5() { return 6469 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 2657 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 151 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity8() { return 622 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 5835 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder10() { return 773 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 3074 }
    /** Derived accessor for status (generated filler). */
    def computeStatus12() { return 9741 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold13() { return 9155 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn14() { return 8029 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder15() { return 3662 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId16() { return 2201 }
    /** Derived accessor for description (generated filler). */
    def computeDescription17() { return 3941 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder18() { return 1459 }
    /** Derived accessor for priority (generated filler). */
}
